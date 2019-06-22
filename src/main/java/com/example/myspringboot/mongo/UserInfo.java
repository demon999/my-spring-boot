package com.example.bootdemo.mongo;

import lombok.Data;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;
import org.mongodb.morphia.utils.IndexType;


@Data
@Entity(noClassnameStored = true)
@Indexes({@Index(fields = @Field(value = "mobile", type = IndexType.ASC))})
public class UserInfo {

    @Id
    private ObjectId _id;

    private String name;

    private String mobile;

}
