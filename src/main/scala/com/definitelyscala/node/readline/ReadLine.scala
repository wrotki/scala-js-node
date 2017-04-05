package com.definitelyscala.node.readline

import scala.scalajs.js
import com.definitelyscala.node.{Buffer, ReadableStream, WritableStream}
import com.definitelyscala.node.events.{internal => events}

import scala.scalajs.js.|

@js.native
trait ReadLine extends events.EventEmitter {
  def setPrompt(prompt: String): Unit = js.native
  def prompt(preserveCursor: Boolean = js.native): Unit = js.native
  def question(query: String, callback: js.Function1[String, Unit]): Unit = js.native
  def pause(): ReadLine = js.native
  def resume(): ReadLine = js.native
  def close(): Unit = js.native
  def write(data: String | Buffer, key: Key = js.native): Unit = js.native
  /**
   * events.EventEmitter
   * 1. close
   * 2. line
   * 3. pause
   * 4. resume
   * 5. SIGCONT
   * 6. SIGINT
   * 7. SIGTSTP
   */
}
@js.native
@js.annotation.JSGlobal("readline")
object Readline extends js.Object {
  // import * as events from "events";
  // import * as stream from "stream";
  type CompleterResult = js.Tuple2[js.Array[String], String]
  def createInterface(input: ReadableStream, output: WritableStream = js.native, completer: Completer = js.native, terminal: Boolean = js.native): ReadLine = js.native
  def createInterface(options: ReadLineOptions): ReadLine = js.native
  def cursorTo(stream: WritableStream, x: Double, y: Double): Unit = js.native
  def moveCursor(stream: WritableStream, dx: Double | String, dy: Double | String): Unit = js.native
  def clearLine(stream: WritableStream, dir: Double): Unit = js.native
  def clearScreenDown(stream: WritableStream): Unit = js.native
}
