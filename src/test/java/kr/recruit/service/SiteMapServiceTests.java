package kr.recruit.service;

import kr.recruit.Application;
import kr.recruit.domain.SiteMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class SiteMapServiceTests {
	@Autowired
	private SiteMapService siteMapService;
	
	@Test
	public void saveSiteMap(){
		SiteMap siteMap = new SiteMap();
//		siteMap.setGroupId(groupId);
		siteMapService.saveSiteMap(siteMap);
	}
	
}
