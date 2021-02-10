for (int i = 0; i < n; i++) {
                int pos = i;
                for (int j = 0; j < n; j++) {
                    if (pairs[pos] == -1)
                        break;
                    pos = pairs[right[i]];
                    if (i == pos) {
                        return 1;
                    }
