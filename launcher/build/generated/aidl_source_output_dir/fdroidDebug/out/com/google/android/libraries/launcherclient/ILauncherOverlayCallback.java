/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: C:\Users\Asus\AppData\Local\Android\Sdk\build-tools\35.0.0\aidl.exe -pC:\Users\Asus\AppData\Local\Android\Sdk\platforms\android-33\framework.aidl -oC:\Users\Asus\Downloads\VirtualApp202410\launcher\build\generated\aidl_source_output_dir\fdroidDebug\out -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\main -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroid\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\debug\aidl -IC:\Users\Asus\Downloads\VirtualApp202410\launcher\src\fdroidDebug\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b3b87dc2c4a0237ae8466e50a9141845\transformed\media-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\5e6b0088e6ff148957d04e21e30daa83\transformed\core-1.0.0\aidl -IC:\Users\Asus\.gradle\caches\8.12\transforms\b9d34fa1348bd6eab7b4c147679cc99f\transformed\versionedparcelable-1.0.0\aidl -dC:\Users\Asus\AppData\Local\Temp\aidl17677826486833706517.d C:\Users\Asus\Downloads\VirtualApp202410\launcher\src\com\google\android\libraries\launcherclient\ILauncherOverlayCallback.aidl
 */
package com.google.android.libraries.launcherclient;
public interface ILauncherOverlayCallback extends android.os.IInterface
{
  /** Default implementation for ILauncherOverlayCallback. */
  public static class Default implements com.google.android.libraries.launcherclient.ILauncherOverlayCallback
  {
    @Override public void overlayScrollChanged(float progress) throws android.os.RemoteException
    {
    }
    @Override public void overlayStatusChanged(int status) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.google.android.libraries.launcherclient.ILauncherOverlayCallback
  {
    /** Construct the stub at attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.google.android.libraries.launcherclient.ILauncherOverlayCallback interface,
     * generating a proxy if needed.
     */
    public static com.google.android.libraries.launcherclient.ILauncherOverlayCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.google.android.libraries.launcherclient.ILauncherOverlayCallback))) {
        return ((com.google.android.libraries.launcherclient.ILauncherOverlayCallback)iin);
      }
      return new com.google.android.libraries.launcherclient.ILauncherOverlayCallback.Stub.Proxy(obj);
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
        case TRANSACTION_overlayScrollChanged:
        {
          float _arg0;
          _arg0 = data.readFloat();
          this.overlayScrollChanged(_arg0);
          break;
        }
        case TRANSACTION_overlayStatusChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.overlayStatusChanged(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements com.google.android.libraries.launcherclient.ILauncherOverlayCallback
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
      @Override public void overlayScrollChanged(float progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_overlayScrollChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void overlayStatusChanged(int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_overlayStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_overlayScrollChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_overlayStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "com.google.android.libraries.launcherclient.ILauncherOverlayCallback";
  public void overlayScrollChanged(float progress) throws android.os.RemoteException;
  public void overlayStatusChanged(int status) throws android.os.RemoteException;
}
