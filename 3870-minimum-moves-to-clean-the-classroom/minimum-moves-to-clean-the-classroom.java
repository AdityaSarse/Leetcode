import java.util.*;

class Solution {
    public int minMoves(String[] classroom, int energy) {
        int rows = classroom.length, cols = classroom[0].length();

        // Locate start and assign each litter cell a bit index
        int startR = 0, startC = 0, litterCount = 0;
        int[][] litterBit = new int[rows][cols];
        for (int[] row : litterBit) Arrays.fill(row, -1);

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char cell = classroom[r].charAt(c);
                if (cell == 'S') {
                    startR = r;
                    startC = c;
                } else if (cell == 'L') {
                    litterBit[r][c] = litterCount++;
                }
            }
        }

        if (litterCount == 0) return 0;

        int fullMask = (1 << litterCount) - 1;
        int startMask = 0; // no litter collected yet (S is never itself an L cell)

        // visited[r][c][energyLeft][mask]
        boolean[][][][] visited = new boolean[rows][cols][energy + 1][1 << litterCount];
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startR, startC, energy, startMask});
        visited[startR][startC][energy][startMask] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        int moves = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] cur = queue.poll();
                int r = cur[0], c = cur[1], e = cur[2], mask = cur[3];

                if (mask == fullMask) return moves;
                if (e == 0) continue;

                for (int d = 0; d < 4; d++) {
                    int nr = r + dr[d], nc = c + dc[d];
                    if (nr < 0 || nr >= rows || nc < 0 || nc >= cols) continue;

                    char cell = classroom[nr].charAt(nc);
                    if (cell == 'X') continue;

                    int newEnergy = e - 1;
                    int newMask = mask;

                    if (cell == 'L' && litterBit[nr][nc] != -1) {
                        newMask |= (1 << litterBit[nr][nc]);
                    } else if (cell == 'R') {
                        newEnergy = energy;
                    }

                    if (!visited[nr][nc][newEnergy][newMask]) {
                        visited[nr][nc][newEnergy][newMask] = true;
                        queue.add(new int[]{nr, nc, newEnergy, newMask});
                    }
                }
            }
            moves++;
        }

        return -1;
    }
}