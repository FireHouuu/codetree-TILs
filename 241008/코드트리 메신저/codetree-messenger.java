import java.util.Scanner;

class chat {
    int parents, left, right, auth, lr;
    public chat (int parents, int left, int right, int auth, int lr) {
        this.parents = parents;
        this.left = left;
        this.right = right;
        this.auth = auth;
        this.lr = lr;
    }
}

public class Main {
    public static int n, q;
    public static int count = 0;

    public static void DFS (chat ch, int depth, chat[] chats) {
        if (ch.auth < 0) return;
        if (ch.auth >= depth)
            count++;

        if (ch.left != -1) {
            DFS(chats[ch.left], depth + 1, chats);
        }
        if (ch.right != -1) {
            DFS(chats[ch.right], depth + 1, chats);
        }
        if (ch.left == -1 && ch.right == -1)
            return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); q = sc.nextInt();
        sc.nextInt();
        chat[] chats = new chat[n+1];
        for (int i = 0; i <= n; i++)
            chats[i] = new chat(-1, -1, -1, -1, -1);

        for (int i = 1; i <= n; i++) {
            int par = sc.nextInt();
            chats[i].parents = par;
            if (chats[par].left == -1) {
                chats[par].left = i;
                chats[i].lr = 0;
            }
            else {
                chats[par].right = i;
                chats[i].lr = 1;
            }
        }
        q--;

        for (int i = 1; i <= n; i++) 
            chats[i].auth = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int order = sc.nextInt();
            if (order == 200) {
                int target = sc.nextInt();
                chats[target].auth = chats[target].auth * -1;
            } else if (order == 300) {
                int target = sc.nextInt();
                int power = sc.nextInt();
                chats[target].auth = power;
            } else if (order == 400) {
                int c1 = sc.nextInt();
                int c2 = sc.nextInt();

                // c1과 c2의 부모와 lr 값을 저장
                int c1_par = chats[c1].parents;
                int c1_lr = chats[c1].lr;
                int c2_par = chats[c2].parents;
                int c2_lr = chats[c2].lr;

                // 부모와 lr 값을 스왑
                chats[c1].parents = c2_par;
                chats[c1].lr = c2_lr;
                chats[c2].parents = c1_par;
                chats[c2].lr = c1_lr;

                // 부모 노드의 자식 포인터를 업데이트
                if (c1_par != -1) {
                    if (chats[c1_par].left == c1) {
                        chats[c1_par].left = c2;
                    } else if (chats[c1_par].right == c1) {
                        chats[c1_par].right = c2;
                    }
                }
                if (c2_par != -1) {
                    if (chats[c2_par].left == c2) {
                        chats[c2_par].left = c1;
                    } else if (chats[c2_par].right == c2) {
                        chats[c2_par].right = c1;
                    }
                }
            } else if (order == 500) {
                count = 0;
                int target = sc.nextInt();
                DFS(chats[target], 0, chats);
                count += -1;
                System.out.println(count);
            }
        }
    }
}