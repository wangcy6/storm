;; Licensed to the Apache Software Foundation (ASF) under one
;; or more contributor license agreements.  See the NOTICE file
;; distributed with this work for additional information
;; regarding copyright ownership.  The ASF licenses this file
;; to you under the Apache License, Version 2.0 (the
;; "License"); you may not use this file except in compliance
;; with the License.  You may obtain a copy of the License at
;;
;; http:;; www.apache.org/licenses/LICENSE-2.0
;;
;; Unless required by applicable law or agreed to in writing, software
;; distributed under the License is distributed on an "AS IS" BASIS,
;; WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;; See the License for the specific language governing permissions and
;; limitations under the License.
(ns backtype.storm.command.dev-zookeeper
  (:use [backtype.storm zookeeper util config])
  (:gen-class))

(defn -main [& args]
  (let [conf (read-storm-config)
        port (conf STORM-ZOOKEEPER-PORT)
        localpath (conf DEV-ZOOKEEPER-PATH)]
    (rmr localpath)
    (mk-inprocess-zookeeper localpath :port port)
    ))
