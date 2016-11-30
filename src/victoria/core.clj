(ns victoria.core
  (:gen-class)
  (:require [clojure.data.json :as json]))

(defn load-configuration [path-to-configuration]
  (let [config (slurp path-to-configuration)]
    (json/read-json config true)))

