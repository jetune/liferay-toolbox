package com.custom.portal.upgrade;
/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */


import com.custom.portal.upgrade.v6_2_0.CustomUpgradeSocial;
import com.liferay.portal.upgrade.UpgradeProcess_6_2_0;
import com.liferay.portal.upgrade.v6_2_0.*;

/**
 * @author Raymond Augé
 * @author Juan Fernández
 */
public class CustomUpgradeProcess_6_2_0 extends UpgradeProcess_6_2_0 {

	@Override
	protected void doUpgrade() throws Exception {
		upgrade(UpgradeSchema.class);
		upgrade(UpgradeAnnouncements.class);
		upgrade(UpgradeAssetPublisher.class);
		upgrade(UpgradeBlogs.class);
		upgrade(UpgradeBlogsAggregator.class);
		upgrade(UpgradeCalendar.class);
		upgrade(UpgradeCompany.class);
		upgrade(UpgradeCustomizablePortlets.class);
		upgrade(UpgradeDocumentLibrary.class);
		upgrade(UpgradeDynamicDataListDisplay.class);
		upgrade(UpgradeDynamicDataMapping.class);
		upgrade(UpgradeGroup.class);
		upgrade(UpgradeImageGallery.class);
		upgrade(UpgradeJournal.class);
		upgrade(UpgradeLayout.class);
		upgrade(UpgradeLayoutFriendlyURL.class);
		upgrade(UpgradeLayoutRevision.class);
		upgrade(UpgradeLayoutSet.class);
		upgrade(UpgradeLayoutSetBranch.class);
		upgrade(UpgradeMessageBoards.class);
		upgrade(UpgradeMessageBoardsAttachments.class);
		upgrade(UpgradePortletItem.class);
		upgrade(UpgradePortletPreferences.class);
		upgrade(UpgradeRepository.class);
		upgrade(UpgradeSearch.class);
		upgrade(CustomUpgradeSocial.class);
		upgrade(UpgradeUser.class);
		upgrade(UpgradeWiki.class);
		upgrade(UpgradeWikiAttachments.class);
	}

}