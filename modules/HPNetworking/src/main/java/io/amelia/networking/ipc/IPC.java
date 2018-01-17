package io.amelia.networking.ipc;

import io.amelia.foundation.Foundation;
import io.amelia.foundation.parcel.ParcelCarrier;
import io.amelia.lang.NetworkException;
import io.amelia.lang.ParcelableException;
import io.amelia.networking.NetworkLoader;
import io.amelia.networking.packets.PacketRequestInfo;
import io.amelia.networking.packets.PacketRequestStop;
import io.amelia.networking.udp.UDPWorker;
import io.amelia.support.data.Parcel;

public class IPC
{
	/**
	 * temp?
	 */
	public static void processIncomingParcel( Parcel src ) throws ParcelableException.Error
	{
		Foundation.getRouter().sendParcel( Parcel.Factory.deserialize( src, ParcelCarrier.class ) );
	}

	public static void start() throws NetworkException.PacketValidation
	{
		udp().sendPacket( new PacketRequestInfo( () -> null ), ( request, response ) -> {

		} );
	}

	public static void status() throws NetworkException.PacketValidation
	{
		udp().sendPacket( new PacketRequestInfo( () -> null ), ( request, response ) -> {
			//Kernel.L.info( "Found Instance: " + r.instanceId + " with IP " + r.ipAddress );
		} );
	}

	public static void stop( String instanceId )
	{
		try
		{
			udp().sendPacket( new PacketRequestStop( instanceId ), ( request, response ) -> {

			} );
		}
		catch ( NetworkException.PacketValidation e )
		{

		}
	}

	private static UDPWorker udp()
	{
		return NetworkLoader.UDP();
	}

	private IPC()
	{
		// Static Class
	}
}
