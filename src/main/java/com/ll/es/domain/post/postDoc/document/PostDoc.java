package com.ll.es.domain.post.postDoc.document;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;
import org.springframework.data.elasticsearch.annotations.Mapping;

@Document(indexName = "app1_posts")
@Setting(settingPath = "elasticsearch/post-setting.json")
@Mapping(mappingPath = "elasticsearch/post-mapping.json")
@Getter
@Setter
@Builder
public class PostDoc {
    @Id
    private String id;
    @Field(type = FieldType.Text)
    private String title;
    @Field(type = FieldType.Text)
    private String content;
}
