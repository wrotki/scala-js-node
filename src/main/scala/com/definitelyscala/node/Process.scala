package com.definitelyscala.node

import com.definitelyscala.node.NodeJS.Platform

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait Process extends EventEmitter {
  var stdout: WritableStream = js.native
  var stderr: WritableStream = js.native
  var stdin: ReadableStream = js.native
  var argv: js.Array[String] = js.native
  var argv0: String = js.native
  var execArgv: js.Array[String] = js.native
  var execPath: String = js.native
  def abort(): Unit = js.native
  def chdir(directory: String): Unit = js.native
  def cwd(): String = js.native
  var env: js.Any = js.native
  def exit(code: Double = js.native): Unit = js.native
  var exitCode: Double = js.native
  def getgid(): Double = js.native
  def setgid(id: Double): Unit = js.native
  def setgid(id: String): Unit = js.native
  def getuid(): Double = js.native
  def setuid(id: Double): Unit = js.native
  def setuid(id: String): Unit = js.native
  var version: String = js.native
  var versions: ProcessVersions = js.native
  var config: js.Any = js.native
  def kill(pid: Double, signal: String | Double = js.native): Unit = js.native
  var pid: Double = js.native
  var title: String = js.native
  var arch: String = js.native
  var platform: Platform = js.native
  var mainModule: NodeModule = js.native
  def memoryUsage(): MemoryUsage = js.native
  def cpuUsage(previousValue: CpuUsage = js.native): CpuUsage = js.native
  def nextTick(callback: js.Function, args: js.Any*): Unit = js.native
  def umask(mask: Double = js.native): Double = js.native
  def uptime(): Double = js.native
  def hrtime(time: js.Tuple2[Double, Double] = js.native): js.Tuple2[Double, Double] = js.native
  var domain: Domain = js.native
  // Worker
  def send(message: js.Any, sendHandle: js.Any = js.native): Unit = js.native
  def disconnect(): Unit = js.native
  var connected: Boolean = js.native
}
