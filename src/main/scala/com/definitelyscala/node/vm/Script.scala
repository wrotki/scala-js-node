package com.definitelyscala.node.vm

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("vm.Script")
class Script protected () extends js.Object {
  def this(code: String, options: ScriptOptions = js.native) = this()
  def runInContext(contextifiedSandbox: Context, options: RunningScriptOptions = js.native): js.Dynamic = js.native
  def runInNewContext(sandbox: Context = js.native, options: RunningScriptOptions = js.native): js.Dynamic = js.native
  def runInThisContext(options: RunningScriptOptions = js.native): js.Dynamic = js.native
}