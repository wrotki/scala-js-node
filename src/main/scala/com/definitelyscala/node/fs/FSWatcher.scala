package com.definitelyscala.node.fs

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}

@js.native
trait FSWatcher extends events.EventEmitter {
  def close(): Unit = js.native
  /**
   * events.EventEmitter
   *   1. change
   *   2. error
   */
}
