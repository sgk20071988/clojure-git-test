(defproject my-clojure-project "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :javac-options ["-target" "1.6" "-source" "1.6" "-Xlint:-options"]
  :aot [my-clojure-project.core]
  :main my-clojure-project.core
  :user {:jvm-opts ["-Dhttp.proxyHost=192.168.1.1" "-Dhttp.proxyPort=8080"]}) 

  

