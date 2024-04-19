package co.istad.springsecuritybasic.restcontroller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/articles")
public class ArticleRestController {

    @GetMapping
    public String getArticles(){
        return "Get all articles from database";
    }

    @GetMapping("/read/{id}")
    public String readSingleArticle(@PathVariable int id){
        return "Read article by id " + id;
    }

    @PostMapping("/write")
    public String createArticle(){
        return "Create new article";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteArticle(@PathVariable int id){
        return "Delete article by id " + id;
    }
}
