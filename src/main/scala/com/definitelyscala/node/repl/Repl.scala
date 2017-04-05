package com.definitelyscala.node.repl

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("repl")
object Repl extends js.Object {
  // import * as stream from "stream";
  // import * as readline from "readline";
  def start(options: ReplOptions): REPLServer = js.native
}