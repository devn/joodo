(ns joodo.kuzushi.version
  (:require
    [clojure.string :as str]))

(def major 1)
(def minor 0)
(def tiny 0)
(def snapshot false)
(def string
  (str
    (str/join "." (filter identity [major minor tiny]))
    (if snapshot "-SNAPSHOT" "")))
(def summary (str "joodo/lein-joodo " string))

(def joodo-version "1.0.0")
