package com.definitelyscala.node.util

import scala.scalajs.js
import com.definitelyscala.node.Buffer
@js.native
@js.annotation.JSGlobal("util")
object Util extends js.Object {
  def format(format: js.Any, param: js.Any*): String = js.native
  def debug(string: String): Unit = js.native
  def error(param: js.Any*): Unit = js.native
  def puts(param: js.Any*): Unit = js.native
  def print(param: js.Any*): Unit = js.native
  def log(string: String): Unit = js.native
  def inspect(`object`: js.Any, showHidden: Boolean = js.native, depth: Double = js.native, color: Boolean = js.native): String = js.native
  def inspect(`object`: js.Any, options: InspectOptions): String = js.native
  def isArray(`object`: js.Any): Boolean = js.native
  def isRegExp(`object`: js.Any): Boolean = js.native
  def isDate(`object`: js.Any): Boolean = js.native
  def isError(`object`: js.Any): Boolean = js.native
  def inherits(constructor: js.Any, superConstructor: js.Any): Unit = js.native
  def debuglog(key: String): js.Function = js.native
  def isBoolean(`object`: js.Any): Boolean = js.native
  def isBuffer(`object`: js.Any): Boolean = js.native
  def isFunction(`object`: js.Any): Boolean = js.native
  def isNull(`object`: js.Any): Boolean = js.native
  def isNullOrUndefined(`object`: js.Any): Boolean = js.native
  def isNumber(`object`: js.Any): Boolean = js.native
  def isObject(`object`: js.Any): Boolean = js.native
  def isPrimitive(`object`: js.Any): Boolean = js.native
  def isString(`object`: js.Any): Boolean = js.native
  def isSymbol(`object`: js.Any): Boolean = js.native
  def isUndefined(`object`: js.Any): Boolean = js.native
  def deprecate(fn: js.Function, message: String): js.Function = js.native
}