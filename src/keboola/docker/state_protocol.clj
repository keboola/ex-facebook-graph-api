(ns keboola.docker.state-protocol)

(defprotocol IState
  (load [this content-path])
  (save [this content content-path]))
