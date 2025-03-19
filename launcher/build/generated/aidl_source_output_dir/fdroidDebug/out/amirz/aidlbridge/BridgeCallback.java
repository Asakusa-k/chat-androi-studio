/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\Asus\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\Asus\AppData\Local\Android\Sdk\platforms\android-33\framework.aidl -oC:\Users\Asus\Downloads\VirtualApp202410\launcher\build\generated\aidl_source_output_dir\fdroidDebug\out -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\main -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroid\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\debug\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroidDebug\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b3b87dc2c4a0237ae8466e50a9141845\transformed\media-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\5e6b0088e6ff148957d04e21e30daa83\transformed\core-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b9d34fa1348bd6eab7b4c147679cc99f\transformed\versionedparcelable-1.0.0\aidl -dC:\Users\Asus\AppData\Local\Temp\aidl12307356565858175943.d C:\Users\Asus\Downloads\VirtualApp202410\launcher\src\amirz\aidlbridge\BridgeCallback.aidl
 */
package amirz.aidlbridge;
public interface BridgeCallback extends android.os.IInterface
{
  /** Default implementation for BridgeCallback. */
  public static class Default implements amirz.aidlbridge.BridgeCallback
  {
    @Override public void onBridgeConnected(android.os.IBinder service) throws android.os.RemoteException
    {
    }
    @Override public void onBridgeDisconnected() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements amirz.aidlbridge.BridgeCallback
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an amirz.aidlbridge.BridgeCallback interface,
     * generating a proxy if needed.
     */
    public static amirz.aidlbridge.BridgeCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof amirz.aidlbridge.BridgeCallback))) {
        return ((amirz.aidlbridge.BridgeCallback)iin);
      }
      return new amirz.aidlbridge.BridgeCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onBridgeConnected:
        {
          android.os.IBinder _arg0;
          _arg0 = data.readStrongBinder();
          this.onBridgeConnected(_arg0);
          break;
        }
        case TRANSACTION_onBridgeDisconnected:
        {
          this.onBridgeDisconnected();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements amirz.aidlbridge.BridgeCallback
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
      @Override public void onBridgeConnected(android.os.IBinder service) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder(service);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBridgeConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onBridgeDisconnected() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onBridgeDisconnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onBridgeConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onBridgeDisconnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "amirz.aidlbridge.BridgeCallback";
  public void onBridgeConnected(android.os.IBinder service) throws android.os.RemoteException;
  public void onBridgeDisconnected() throws android.os.RemoteException;
}
