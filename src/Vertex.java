import java.util.HashSet;

public class Vertex{
    private HashSet<Vertex> neighbours;
    private HashSet<Integer> saturatedColors;

    private boolean scheduled;
    private int scheduling;
    private int nb;

    public Vertex(int totalVertexCount, int number){
        if(totalVertexCount<0)
            totalVertexCount = 0;

        nb = number;

        neighbours = new HashSet<>(totalVertexCount);
        saturatedColors = new HashSet<>(50);
        scheduled = false;
    }

    public int getDegree(){
        return neighbours.size();
    }

    public int getSaturatedDegree(){
        return saturatedColors.size();
    }

    public void addEdge(Vertex neighbour){
        neighbours.add(neighbour);
    }

    public void addSaturatedColor(int saturatedColor){
        saturatedColors.add(saturatedColor);
    }

    public HashSet<Vertex> getNeighbours() {
        return neighbours;
    }

    public HashSet<Integer> getSaturatedColors() {
        return saturatedColors;
    }

    public boolean isNotScheduled() {
        return !scheduled;
    }

    public boolean isScheduled() {
        return scheduled;
    }

    public void setScheduled(Boolean scheduled) {
        this.scheduled = scheduled;
    }

    public int getScheduling() {
        return scheduling;
    }

    public void setScheduling(int scheduling) {
        this.scheduling = scheduling;
        setScheduled(true);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Vertex)) return false;
        return this.nb == ((Vertex)obj).nb;
    }
}
