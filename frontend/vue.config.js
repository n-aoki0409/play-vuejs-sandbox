const pages = {
  app: {
    entry: "src/pages/app/main.ts",
    template: "public/index.html",
    filename: "app.html"
  }
};

module.exports = {
  pages: pages,

  outputDir: "../public",

  filenameHashing: false,

  chainWebpack: config => {
    Object.keys(pages).forEach(page => {
      config.plugins.delete(`html-${page}`);
      config.plugins.delete(`preload-${page}`);
      config.plugins.delete(`prefetch-${page}`);
    });
  }
};
