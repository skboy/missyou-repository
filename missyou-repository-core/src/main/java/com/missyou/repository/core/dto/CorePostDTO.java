package com.missyou.repository.core.dto;

import com.missyou.repository.core.domain.CorePost;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode
@Accessors(chain = true)
public class CorePostDTO extends CorePost {
    private static final long serialVersionUID = 3578519896191850146L;
    private String username;
}
