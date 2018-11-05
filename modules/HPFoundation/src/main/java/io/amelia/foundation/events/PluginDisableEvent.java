/**
 * This software may be modified and distributed under the terms
 * of the MIT license.  See the LICENSE file for details.
 * <p>
 * Copyright (c) 2018 Amelia Sara Greene <barelyaprincess@gmail.com>
 * Copyright (c) 2018 Penoaks Publishing LLC <development@penoaks.com>
 * <p>
 * All Rights Reserved.
 */
package io.amelia.foundation.events;

import io.amelia.foundation.plugins.PluginBase;

/**
 * Called when a plugin is disabled.
 */
public class PluginDisableEvent extends PluginEvent
{
	public PluginDisableEvent( final PluginBase plugin )
	{
		super( plugin );
	}
}
