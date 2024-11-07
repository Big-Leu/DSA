import java.util.*;

class code4 {
    public static int ArrayChallenge(String[] strArr) {
        char piece = strArr[0].charAt(0);
        int[] columns = new int[12];
        for (int i = 1; i <= 12; i++) {
          columns[i - 1] = Integer.parseInt(strArr[i]);
        }
    
        int maxCompletedLines = 0;
    
        for (int pos = 0; pos <= 12 - getPieceWidth(piece); pos++) {
          int[] newColumns = columns.clone();
          dropPiece(newColumns, piece, pos);
          int completedLines = countCompletedLines(newColumns);
          maxCompletedLines = Math.max(maxCompletedLines, completedLines);
        }
    
        return maxCompletedLines;
      }
    
      private static int getPieceWidth(char piece) {
        switch (piece) {
          case 'I': return 4;
          case 'O': return 2;
          case 'T': return 3;
          case 'S': return 3;
          case 'Z': return 3;
          case 'J': return 3;
          case 'L': return 3;
          default: throw new IllegalArgumentException("Unknown piece: " + piece);
        }
      }
    
      private static void dropPiece(int[] columns, char piece, int pos) {
        int height = 0;
        switch (piece) {
          case 'I':
            height = Math.max(columns[pos], Math.max(columns[pos + 1], Math.max(columns[pos + 2], columns[pos + 3])));
            columns[pos] = columns[pos + 1] = columns[pos + 2] = columns[pos + 3] = height + 1;
            break;
          case 'O':
            height = Math.max(columns[pos], columns[pos + 1]);
            columns[pos] = columns[pos + 1] = height + 2;
            break;
          case 'T':
            height = Math.max(columns[pos], Math.max(columns[pos + 1] + 1, columns[pos + 2]));
            columns[pos] = columns[pos + 2] = height;
            columns[pos + 1] = height + 1;
            break;
          case 'S':
            height = Math.max(columns[pos + 1], columns[pos + 2]);
            columns[pos] = columns[pos + 1] = height + 1;
            columns[pos + 2] = height;
            break;
          case 'Z':
            height = Math.max(columns[pos], columns[pos + 1]);
            columns[pos] = height;
            columns[pos + 1] = columns[pos + 2] = height + 1;
            break;
          case 'J':
            height = Math.max(columns[pos], Math.max(columns[pos + 1], columns[pos + 2]));
            columns[pos] = height + 1;
            columns[pos + 1] = columns[pos + 2] = height;
            break;
          case 'L':
            height = Math.max(columns[pos], Math.max(columns[pos + 1], columns[pos + 2]));
            columns[pos + 2] = height + 1;
            columns[pos] = columns[pos + 1] = height;
            break;
          default:
            throw new IllegalArgumentException("Unknown piece: " + piece);
        }
      }
    
      private static int countCompletedLines(int[] columns) {
        int minHeight = Arrays.stream(columns).min().orElse(0);
        return (int) Arrays.stream(columns).filter(height -> height == minHeight).count();
      }
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    String[] strArr = s.nextLine().split(",");
    System.out.print(ArrayChallenge(strArr)); 
  }
}