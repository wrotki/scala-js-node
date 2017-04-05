package com.definitelyscala.node

import scala.scalajs.js

@js.native
@js.annotation.JSGlobalScope
object Node extends js.Object {
  /**
   * **********************************************
   *                                               *
   *               Node.js v7.x API                *
   *                                               *
   * **********************************************
   */
  // This needs to be global to avoid TS2403 in case lib.dom.d.ts is present in the same build
  // compat for TypeScript 1.8
  // if you use with --target es3 or --target es5 and use below definitions,
  // use the lib.es6.d.ts that is bundled with TypeScript 1.8.
  /**
   * **********************************************
   *                                               *
   *                   GLOBAL                      *
   *                                               *
   * **********************************************
   */
  var process: Process = js.native
  var global: Global = js.native
  var console: Console = js.native
  var __filename: String = js.native
  var __dirname: String = js.native
  def setTimeout(callback: js.Function, ms: Double, args: js.Any*): Timer = js.native
  def clearTimeout(timeoutId: Timer): Unit = js.native
  def setInterval(callback: js.Function, ms: Double, args: js.Any*): Timer = js.native
  def clearInterval(intervalId: Timer): Unit = js.native
  def setImmediate(callback: js.Function, args: js.Any*): js.Dynamic = js.native
  def clearImmediate(immediateId: js.Any): Unit = js.native
  var require: NodeRequire = js.native
  var module: NodeModule = js.native
  // Same as module.exports
  var exports: js.Any = js.native
  // Buffer class
  type BufferEncoding = String
}
