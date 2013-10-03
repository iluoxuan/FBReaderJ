/*
 * Copyright (C) 2010-2013 Geometer Plus <contact@geometerplus.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 */

package org.geometerplus.fbreader.network;

import org.geometerplus.fbreader.network.opds.OPDSPredefinedNetworkLink;
import org.geometerplus.fbreader.network.rss.RSSNetworkLink;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoCollection;
import org.geometerplus.fbreader.network.urlInfo.UrlInfoWithDate;

public class NetworkLinkCreator {
	public NetworkLinkCreator() {
	}

	public AbstractNetworkLink createOPDSLink(int id, String predifinedId, String siteName, CharSequence title, CharSequence summary, String language, UrlInfoCollection<UrlInfoWithDate> infos) {
		return new OPDSPredefinedNetworkLink(
			id,
			predifinedId,
			siteName,
			title.toString(),
			summary != null ? summary.toString() : null,
			language,
			infos
		);
	}

	public AbstractNetworkLink createRSSLink(int id, String siteName, CharSequence title, CharSequence summary, String language, UrlInfoCollection<UrlInfoWithDate> infos) {
		return new RSSNetworkLink(
			id,
			siteName,
			title.toString(),
			summary != null ? summary.toString() : null,
			language,
			infos
		);
	}
}
