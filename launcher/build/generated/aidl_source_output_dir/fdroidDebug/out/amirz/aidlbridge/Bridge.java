/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\Asus\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\Asus\AppData\Local\Android\Sdk\platforms\android-33\framework.aidl -oC:\Users\Asus\Downloads\VirtualApp202410\launcher\build\generated\aidl_source_output_dir\fdroidDebug\out -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\main -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroid\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\debug\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroidDebug\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b3b87dc2c4a0237ae8466e50a9141845\transformed\media-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\5e6b0088e6ff148957d04e21e30daa83\transformed\core-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b9d34fa1348bd6eab7b4c147679cc99f\transformed\versionedparcelable-1.0.0\aidl -dC:\Users\Asus\AppData\Local\Temp\aidl8169592293938690682.d C:\Users\Asus\Downloads\VirtualApp202410\launcher\src\amirz\aidlbridge\Bridge.aidl
 */
package amirz.aidlbridge;
public interface Bridge extends android.os.IInterface
{
  /** Default implementation for Bridge. */
  public static class Default implements amirz.aidlbridge.Bridge
  {
    @Override public void setCallback(int index, amirz.aidlbridge.BridgeCallback cb) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements amirz.aidlbridge.Bridge
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an amirz.aidlbridge.Bridge interface,
     * generating a proxy if needed.
     */
    public static amirz.aidlbridge.Bridge asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof amirz.aidlbridge.Bridge))) {
        return ((amirz.aidlbridge.Bridge)iin);
      }
      return new amirz.aidlbridge.Bridge.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      switch (code)
      {
        case TRANSACTION_setCallback:
        {
          int _arg0;
          _arg0 = data.readInt();
          amirz.aidlbridge.BridgeCallback _arg1;
          _arg1 = amirz.aidlbridge.BridgeCallback.Stub.asInterface(data.readStrongBinder());
          this.setCallback(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements amirz.aidlbridge.Bridge
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void setCallback(int index, amirz.aidlbridge.BridgeCallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(index);
          _data.writeStrongInterface(cb);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "amirz.aidlbridge.Bridge";
  public void setCallback(int index, amirz.aidlbridge.BridgeCallback cb) throws android.os.RemoteException;
}
