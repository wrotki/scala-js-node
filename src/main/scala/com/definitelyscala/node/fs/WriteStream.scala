package com.definitelyscala.node.fs

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.stream.{internal => stream}
import scala.scalajs.js.|

@js.native
trait WriteStream extends stream.Writable {
  def close(): Unit = js.native
  var bytesWritten: Double = js.native
  var path: String | Buffer = js.native
  /**
   * events.EventEmitter
   *   1. open
   *   2. close
   */
}
