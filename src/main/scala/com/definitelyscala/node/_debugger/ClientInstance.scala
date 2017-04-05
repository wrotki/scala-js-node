package com.definitelyscala.node._debugger

import com.definitelyscala.node.EventEmitter

import scala.scalajs.js

@js.native
trait ClientInstance extends EventEmitter {
  var protocol: Protocol = js.native
  var scripts: js.Array[ScriptDesc] = js.native
  var handles: js.Array[ScriptDesc] = js.native
  var breakpoints: js.Array[Breakpoint] = js.native
  var currentSourceLine: Double = js.native
  var currentSourceColumn: Double = js.native
  var currentSourceLineText: String = js.native
  var currentFrame: Double = js.native
  var currentScript: String = js.native
  def connect(port: Double, host: String): Unit = js.native
  def req(req: js.Any, cb: RequestHandler): Unit = js.native
  def reqFrameEval(code: String, frame: Double, cb: RequestHandler): Unit = js.native
  def mirrorObject(obj: js.Any, depth: Double, cb: ResponseBodyHandler): Unit = js.native
  def setBreakpoint(rq: BreakpointMessageBody, cb: RequestHandler): Unit = js.native
  def clearBreakpoint(rq: Request, cb: RequestHandler): Unit = js.native
  def listbreakpoints(cb: RequestHandler): Unit = js.native
  def reqSource(from: Double, to: Double, cb: RequestHandler): Unit = js.native
  def reqScripts(cb: js.Any): Unit = js.native
  def reqContinue(cb: RequestHandler): Unit = js.native
}
