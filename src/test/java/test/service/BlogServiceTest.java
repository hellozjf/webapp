package test.service;

import static org.testng.Assert.assertTrue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.testng.annotations.Test;

@ContextConfiguration("classpath*:/webapp-context.xml")
public class BlogServiceTest {

    @Autowired
    private BlogService blogService;
    
    @Test
    public void testCount() {
        assertTrue(blogService.getCount() == 1);
    }
}
