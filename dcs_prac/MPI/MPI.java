import MPI.mpi;

public class MPI{
    public static void main(String args[]) {
        MPI.Init(args);
        int rank = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();
        int root = 0;
        int sendbuf[]=null;
        sendbuf = new int[size];
        if(rank==root){
            
        }        
    }
}