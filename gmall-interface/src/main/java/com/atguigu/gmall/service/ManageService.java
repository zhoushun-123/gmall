package com.atguigu.gmall.service;


import com.atguigu.gmall.bean.*;

import java.util.List;

public interface ManageService {
    //http://localhost:8082/getCatalog1
    List<BaseCatalog1> getCatalog1();
    //http://localhost:8082/getCatalog2?catalog1Id=6
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    //http://localhost:8082/getCatalog3?catalog2Id=30
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    //http://localhost:8082/attrInfoList?catalog3Id=38
    List<BaseAttrInfo> attrInfoList(String catalog3Id);
    //http://localhost:8082/saveAttrInfo
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);
    //http://localhost:8082/getAttrValueList?attrId=100
    List<BaseAttrValue> getAttrValueList(String attrId);
}
