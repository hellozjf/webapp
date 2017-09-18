package test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.dao.BlogDao;
import test.model.Blog;
import test.model.BlogExample;

@Service
public class BlogService {

    @Autowired
    private BlogDao blogDao;
    
    public int getCount() {
        BlogExample blogExample = new BlogExample();
        return blogDao.countByExample(blogExample);
    }
    
    public void addBlog(int id, String content) {
        Blog blog = new Blog();
        blog.setId(id);
        blog.setContent(content);
        blogDao.insert(blog);
    }
}
