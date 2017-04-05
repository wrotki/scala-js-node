package com.definitelyscala.node.http

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("http.STATUS_CODES")
object STATUS_CODES extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(errorCode: Double): String = js.native
  @js.annotation.JSBracketAccess
  def update(errorCode: Double, v: String): Unit = js.native
  @js.annotation.JSBracketAccess
  def apply(errorCode: String): String = js.native
  @js.annotation.JSBracketAccess
  def update(errorCode: String, v: String): Unit = js.native
}