import Vue from "vue";
import VueRouter, { RouteConfig } from "vue-router";
import About1 from "../views/About1.vue";
import About2 from "../views/About2.vue";

Vue.use(VueRouter);

const routes: Array<RouteConfig> = [
  {
    path: "/about1",
    name: "About1",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: About1
  },
  {
    path: "/about2",
    name: "About2",
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: About2
  }
];

const router = new VueRouter({
  routes
});

export default router;
