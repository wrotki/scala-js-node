package com.definitelyscala.node.readline

import com.definitelyscala.node.readline.Readline.CompleterResult

import scala.scalajs.js

@js.native
trait Completer extends js.Object {
  def apply(line: String): CompleterResult = js.native
  def apply(line: String, callback: js.Function2[js.Any, CompleterResult, Unit]): js.Dynamic = js.native
}
