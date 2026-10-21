package me.wuwenbin.noteblogv4.model.pojo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import me.wuwenbin.noteblogv4.model.entity.NBTag;


@Setter
@Getter
@ToString
public class NBTagVO extends NBTag {
    private String selected;
}
