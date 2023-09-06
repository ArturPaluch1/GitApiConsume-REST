package GitConsume.GitConsume.Controllers;

import GitConsume.GitConsume.Services.GitHubRepositoryServiceImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

@RestController
public class GitConsumeController {

    private final GitHubRepositoryServiceImpl gitHubRepositoryService;

    public GitConsumeController(GitHubRepositoryServiceImpl gitHubRepositoryService) {
        this.gitHubRepositoryService = gitHubRepositoryService;
    }

    @GetMapping("/getUserRepository")
    public Object getUserRepository(@RequestParam(value = "gitHubUser", required = false) String gitHubUser, @RequestHeader(HttpHeaders.ACCEPT) String acceptHeader) {




        var repositories = gitHubRepositoryService.getUserRepositoriesList(gitHubUser, acceptHeader);


        return repositories;

    }

}
