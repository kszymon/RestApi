package pl.nullpointerexception.restapi.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.nullpointerexception.restapi.model.Post;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    void shouldGetSinglePost() {
        //given
        //when
        Post singlePost = postService.getSinglePost(1L);
        //then
        assertThat(singlePost).isNotNull();
        assertThat(singlePost.getId()).isEqualTo(1L);
    }

}