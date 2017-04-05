package com.definitelyscala.node

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait NodeBuffer extends js.Any {
  def write(string: String, offset: Double = js.native, length: Double = js.native, encoding: String = js.native): Double = js.native
  def toString(encoding: String = js.native, start: Double = js.native, end: Double = js.native): String = js.native
  def toJSON(): js.Dynamic = js.native
  def equals(otherBuffer: Buffer): Boolean = js.native
  def compare(otherBuffer: Buffer, targetStart: Double = js.native, targetEnd: Double = js.native, sourceStart: Double = js.native, sourceEnd: Double = js.native): Double = js.native
  def copy(targetBuffer: Buffer, targetStart: Double = js.native, sourceStart: Double = js.native, sourceEnd: Double = js.native): Double = js.native
  def slice(start: Double = js.native, end: Double = js.native): Buffer = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def readIntLE(offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def readIntBE(offset: Double, byteLength: Double, noAssert: Boolean = js.native): Double = js.native
  def readUInt8(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readUInt16LE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readUInt16BE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readUInt32LE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readUInt32BE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readInt8(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readInt16LE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readInt16BE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readInt32LE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readInt32BE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readFloatLE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readFloatBE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readDoubleLE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def readDoubleBE(offset: Double, noAssert: Boolean = js.native): Double = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def writeUInt8(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeUInt16LE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeUInt16BE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeUInt32LE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeUInt32BE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeInt8(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeInt16LE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeInt16BE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeInt32LE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeInt32BE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeFloatLE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeFloatBE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeDoubleLE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def writeDoubleBE(value: Double, offset: Double, noAssert: Boolean = js.native): Double = js.native
  def fill(value: js.Any, offset: Double = js.native, end: Double = js.native): js.Dynamic = js.native
  def indexOf(value: String | Double | Buffer, byteOffset: Double = js.native, encoding: String = js.native): Double = js.native
  def lastIndexOf(value: String | Double | Buffer, byteOffset: Double = js.native, encoding: String = js.native): Double = js.native
  def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
  def includes(value: String | Double | Buffer, byteOffset: Double = js.native, encoding: String = js.native): Boolean = js.native
  def keys(): IterableIterator[Double] = js.native
  def values(): IterableIterator[Double] = js.native
}
