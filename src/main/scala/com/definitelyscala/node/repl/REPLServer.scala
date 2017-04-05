package com.definitelyscala.node.repl

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.readline
import scala.scalajs.js.|

@js.native
trait REPLServer extends readline.ReadLine {
  def defineCommand(keyword: String, cmd: js.Function | js.Any): Unit = js.native
  def displayPrompt(preserveCursor: Boolean = js.native): Unit = js.native
  /**
   * events.EventEmitter
   * 1. exit
   * 2. reset
   */
}
