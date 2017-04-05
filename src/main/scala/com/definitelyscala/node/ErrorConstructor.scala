package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait ErrorConstructor extends js.Object {
  def captureStackTrace(targetObject: Object, constructorOpt: js.Function = js.native): Unit = js.native
  var stackTraceLimit: Double = js.native
}