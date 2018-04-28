package cn.itcast.bos.service.impl;

import javax.annotation.Resource;

import org.springframework.transaction.annotation.Transactional;


import org.springframework.stereotype.Service;

import cn.itcast.bos.dao.IWorkordermanageDao;
import cn.itcast.bos.domain.Workordermanage;
import cn.itcast.bos.service.IWorkordermanageService;

/**
 * 工作单操作Service
 */
@Service
@Transactional
public class WorkordermanageServiceImpl implements IWorkordermanageService{
	@Resource
	private IWorkordermanageDao workordermanageDao;

	public void save(Workordermanage model) {
		workordermanageDao.save(model);
	}
}
