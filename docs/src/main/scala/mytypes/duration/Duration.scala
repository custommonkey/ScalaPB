// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package mytypes.duration

@SerialVersionUID(0L)
final case class Duration(
    seconds: _root_.scala.Int = 0,
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[Duration] {
    @transient
    private[this] var __serializedSizeCachedValue: _root_.scala.Int = 0
    private[this] def __computeSerializedValue(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = seconds
        if (__value != 0) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeInt32Size(1, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var read = __serializedSizeCachedValue
      if (read == 0) {
        read = __computeSerializedValue()
        __serializedSizeCachedValue = read
      }
      read
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = seconds
        if (__v != 0) {
          _output__.writeInt32(1, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withSeconds(__v: _root_.scala.Int): Duration = copy(seconds = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = seconds
          if (__t != 0) __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PInt(seconds)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion = mytypes.duration.Duration
    // @@protoc_insertion_point(GeneratedMessage[mytypes.Duration])
}

object Duration extends scalapb.GeneratedMessageCompanion[mytypes.duration.Duration] with scalapb.HasBuilder[mytypes.duration.Duration] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[mytypes.duration.Duration] with scalapb.HasBuilder[mytypes.duration.Duration] = this
  def merge(`_message__`: mytypes.duration.Duration, `_input__`: _root_.com.google.protobuf.CodedInputStream): mytypes.duration.Duration = newBuilder(_message__).merge(_input__).result()
  implicit def messageReads: _root_.scalapb.descriptors.Reads[mytypes.duration.Duration] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      mytypes.duration.Duration(
        seconds = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Int]).getOrElse(0)
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = DurationProto.javaDescriptor.getMessageTypes().get(0)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = DurationProto.scalaDescriptor.messages(0)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = mytypes.duration.Duration(
    seconds = 0
  )
  final class Builder private (
    private var __seconds: _root_.scala.Int,
    private var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder
  ) extends _root_.scalapb.MessageBuilder[mytypes.duration.Duration] {
    def merge(`_input__`: _root_.com.google.protobuf.CodedInputStream): this.type = {
      var _done__ = false
      while (!_done__) {
        val _tag__ = _input__.readTag()
        _tag__ match {
          case 0 => _done__ = true
          case 8 =>
            __seconds = _input__.readInt32()
          case tag =>
            if (_unknownFields__ == null) {
              _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
            }
            _unknownFields__.parseField(tag, _input__)
        }
      }
      this
    }
    def result(): mytypes.duration.Duration = {
      mytypes.duration.Duration(
          seconds = __seconds,
          unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
      )
    }
  }
  object Builder extends _root_.scalapb.MessageBuilderCompanion[mytypes.duration.Duration, mytypes.duration.Duration.Builder] {
    def apply(): Builder = new Builder(
      __seconds = 0,
      `_unknownFields__` = null
    )
    def apply(`_message__`: mytypes.duration.Duration): Builder = new Builder(
      __seconds = _message__.seconds,
      `_unknownFields__` = new _root_.scalapb.UnknownFieldSet.Builder(_message__.unknownFields)
    )
  }
  def newBuilder: Builder = mytypes.duration.Duration.Builder()
  def newBuilder(`_message__`: mytypes.duration.Duration): Builder = mytypes.duration.Duration.Builder(_message__)
  implicit class DurationLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, mytypes.duration.Duration]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, mytypes.duration.Duration](_l) {
    def seconds: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Int] = field(_.seconds)((c_, f_) => c_.copy(seconds = f_))
  }
  final val SECONDS_FIELD_NUMBER = 1
  def of(
    seconds: _root_.scala.Int
  ): _root_.mytypes.duration.Duration = _root_.mytypes.duration.Duration(
    seconds
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[mytypes.Duration])
}
