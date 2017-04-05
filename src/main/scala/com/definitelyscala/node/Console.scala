package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait Console extends js.Object {
  var Console: ConsoleConstructor = js.native
  def assert(value: js.Any, message: String, optionalParams: js.Any*): Unit = js.native
  def dir(obj: js.Any, options: js.Any = js.native): Unit = js.native
  def error(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def info(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def log(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def time(label: String): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  def trace(message: js.Any, optionalParams: js.Any*): Unit = js.native
  def warn(message: js.Any, optionalParams: js.Any*): Unit = js.native
}
