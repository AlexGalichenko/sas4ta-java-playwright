This is practical task made on java + playwright

how to run
```gradle test```

you also can customize run via env variables

BROWSER (default: chromium, webkit, firefox, chrome, edge) - run on certain browser

HEADLESS (default: false, true) - headless switch

VIEWPORT (default: FHD, HD, QHD) - viewport to run

e.g
```BROWSER=edge HEADLESS=true VIEWPORT=HD gradle test```

report can be found in build/reports folder