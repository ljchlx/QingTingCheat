package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

public class ClassSerializer
  implements ObjectSerializer
{
  public static final ClassSerializer instance = new ClassSerializer();

  public void write(JSONSerializer paramJSONSerializer, Object paramObject1, Object paramObject2, Type paramType)
    throws IOException
  {
    paramJSONSerializer.getWriter().writeString(((Class)paramObject1).getName());
  }
}

/* Location:           /Users/zhangxun-xy/Downloads/qingting2/classes_dex2jar.jar
 * Qualified Name:     com.alibaba.fastjson.serializer.ClassSerializer
 * JD-Core Version:    0.6.2
 */