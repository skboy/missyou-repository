package com.missyou.repository.core.tests;

import com.missyou.repository.core.CoreRepositoryApplication;
import com.missyou.repository.core.mapper.CoreAdminMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CoreRepositoryApplication.class)
public class CoreAdminTests {

	@Resource
	private CoreAdminMapper coreAdminMapper;

	@Test
	public void testConnection() {
		coreAdminMapper.selectCount(null);
	}

}
