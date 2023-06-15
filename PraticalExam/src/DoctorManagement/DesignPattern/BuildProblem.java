package DoctorManagement.DesignPattern;

public class BuildProblem {
    public Strategy strategy;
    
    public BuildProblem(Strategy strategy) {
        this.strategy = strategy;
    }
    
    public void SolveProblem() {
        this.strategy.Solve();
    }
}
