(ns repro
  "Lambda entrypoint"
  (:gen-class :implements [com.amazonaws.services.lambda.runtime.RequestStreamHandler])
  (:require [expound.alpha :as expound]))

(defn -handleRequest [_this _is _os _context]
  (throw (ex-info (str "oh no: " (expound/expound-str string? 1 {:print-specs? false}))
                  {})))
