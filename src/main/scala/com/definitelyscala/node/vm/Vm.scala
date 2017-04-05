package com.definitelyscala.node.vm

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("vm")
object Vm extends js.Object {
  def createContext(sandbox: Context = js.native): Context = js.native
  def isContext(sandbox: Context): Boolean = js.native
  def runInContext(code: String, contextifiedSandbox: Context, options: RunningScriptOptions = js.native): js.Dynamic = js.native
  def runInDebugContext(code: String): js.Dynamic = js.native
  def runInNewContext(code: String, sandbox: Context = js.native, options: RunningScriptOptions = js.native): js.Dynamic = js.native
  def runInThisContext(code: String, options: RunningScriptOptions = js.native): js.Dynamic = js.native
}